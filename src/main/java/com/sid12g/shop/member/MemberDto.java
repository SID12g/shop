package com.sid12g.shop.member;

public class MemberDto {
    public String username;
    public String displayName;

    MemberDto(String username, String displayName) {
        this.username = username;
        this.displayName = displayName;
    }
}