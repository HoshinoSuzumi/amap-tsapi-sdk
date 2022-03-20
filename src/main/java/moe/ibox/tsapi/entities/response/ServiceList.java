package moe.ibox.tsapi.entities.response;

import java.io.Serializable;
import java.util.List;

public class ServiceList implements Serializable {
    List<Service> results;

    public List<Service> getResults() {
        return results;
    }

    public void setResults(List<Service> results) {
        this.results = results;
    }
}
