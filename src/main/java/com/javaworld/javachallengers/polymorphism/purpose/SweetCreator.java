package com.javaworld.javachallengers.polymorphism.purpose;

import java.util.List;

public class SweetCreator {

    private List<SweetProducer> sweetProducer;

    public SweetCreator(List<SweetProducer> sweetProducer) {
        this.sweetProducer = sweetProducer;
    }

    public void createSweets() {
        sweetProducer.forEach(sweet -> sweet.produceSweet());
    }

}
