package com.school.api.controller;

import javax.servlet.http.HttpServletRequest;

public abstract class BaseController {

    protected String getFullAppUrl(HttpServletRequest request) {
        return "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    }

}
