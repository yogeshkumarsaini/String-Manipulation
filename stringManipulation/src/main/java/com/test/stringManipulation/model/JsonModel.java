package com.test.stringManipulation.model;

import jakarta.persistence.*;

@Entity
public class JsonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String jsonModel;

    public JsonModel() {
    }

    public JsonModel(String jsonModel) {
        this.jsonModel = jsonModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJsonModel() {
        return jsonModel;
    }

    public void setJsonModel(String jsonModel) {
        this.jsonModel = jsonModel;
    }
}