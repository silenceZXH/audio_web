package com.audio.audio_web.controller;

public class BaseController {

    public String render(String viewName) {
        return "/" + viewName;
    }

    public String render_404() {
        return "/error_404";
    }
}
