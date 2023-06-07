package com.contact.entity;

public class Contact {

    private Long cId;
    private String email;
    private String contactName;
    private Long userId;

    public Contact(Long cId, String email, String contactName, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }


    public Long getCId() {
        return cId;
    }

    public Contact setCId(Long cId) {
        this.cId = cId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getContactName() {
        return contactName;
    }

    public Contact setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public Contact setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
}
