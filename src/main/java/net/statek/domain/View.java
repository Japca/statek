package net.statek.domain;

public enum View {

    ABOUT("about"),
    INDEX("index"),
    GALLERY("gallery"),
    EQUIPMENT("equipment"),
    PROFILE("profile");

    private String viewName;

    View(String viewName) {
        this.viewName = viewName;
    }

    public String getName() {
        return viewName;
    }
}

