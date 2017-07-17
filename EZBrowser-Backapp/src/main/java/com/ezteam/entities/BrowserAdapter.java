package com.ezteam.entities;

import org.springframework.stereotype.Component;

@Component
public class BrowserAdapter {

    public Browser toBrowser(final BrowserDTO browserDTO) {
        return browserDTO != null ?
                Browser.builder()
                .id(browserDTO.getId())
                .title(browserDTO.getTitle())
                .author(browserDTO.getAuthor())
                .date(browserDTO.getDate())
                .keyword(browserDTO.getKeyword())
                .url(browserDTO.getUrl())
                .build()
            : null;
    }

    public BrowserDTO toBrowserDto(final Browser browser) {
        return browser != null ?
                BrowserDTO.builder()
                .id(browser.getId())
                .title(browser.getTitle())
                .author(browser.getAuthor())
                .date(browser.getDate())
                .keyword(browser.getKeyword())
                .url(browser.getUrl())
                .build()
            : null;
    }
}
