package resolver.mongo;


import org.springframework.data.annotation.Id;


public class Xpath {

    @Id
    private String id;

    private String xpath;
    private String html;


    public Xpath() {}

    public Xpath(String xpath, String html) {

        this.xpath = xpath;
        this.html = html;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, xpath, html);
    }

}