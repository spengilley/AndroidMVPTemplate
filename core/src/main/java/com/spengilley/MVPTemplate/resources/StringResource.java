package com.spengilley.MVPTemplate.resources;


public class StringResource {
    ResourceWrapper resourceWrapper;
    String resourceName;

    public StringResource(ResourceWrapper resourceWrapper, String resourceName) {
        this.resourceWrapper = resourceWrapper;
        this.resourceName = resourceName;
    }


    public String get() {
        return resourceWrapper.getString(resourceName);
    }
}
