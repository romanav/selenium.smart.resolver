
package com.averkin.resolver;

import com.averkin.resolver.mongo.CustomerRepository;
import com.averkin.resolver.mongo.Xpath;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class WriteLogToDB {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private MockMvc mvc;

    @Test
    public void testWritingLogs() throws Exception {

        repository.deleteAll();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        node.put("classifier", "Library1");
        node.put("className", "TestClass");
        node.put("methodName","testSomethingMethod");
        node.put("status", "passed");
        node.put("xpath","//body");



        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/add")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(node.toString())).andExpect(status().isOk()).andReturn();


        List<Xpath> all = repository.findAll();
        assertThat(all.size()).isEqualTo(1);
//        assertThat(all.get(0).className).isEqualTo("TestClass");
//        System.out.println();
    }

}


