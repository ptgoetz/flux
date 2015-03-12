package org.apache.storm.flux.model;

import java.util.List;

/**
 * Abstract parent class of component definitions
 * (spouts/bolts)
 */
public abstract class VertexDef extends BeanDef {

    private int parallelism;

    public int getParallelism() {
        return parallelism;
    }

    public void setParallelism(int parallelism) {
        this.parallelism = parallelism;
    }

}