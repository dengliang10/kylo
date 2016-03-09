/**
 * 
 */
package com.thinkbiganalytics.metadata.rest.model.feed;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.thinkbiganalytics.metadata.rest.model.sla.Metric;

/**
 *
 * @author Sean Felten
 */
@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedPrecondition {

    private List<Metric> metrics = new ArrayList<>();

    public FeedPrecondition() {
        super();
    }
    
    public FeedPrecondition(List<Metric> metrics) {
        this.metrics.addAll(metrics);
    }

    public List<Metric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<Metric> metrics) {
        this.metrics = new ArrayList<>(metrics);
    }
}
