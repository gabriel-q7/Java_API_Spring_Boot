package dev.gabrielQ7.streamsschedule.model;

import java.time.LocalDateTime;

public record LiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {
    /*
    public LiveStream {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
    }

    public boolean isLive() {
        return LocalDateTime.now().isAfter(startDate) && LocalDateTime.now().isBefore(endDate);
    }
     */
}
