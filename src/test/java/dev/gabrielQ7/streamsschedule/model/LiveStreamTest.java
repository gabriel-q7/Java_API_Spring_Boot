package dev.gabrielQ7.streamsschedule.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class LiveStreamTest {

    @Test
    void create_new_mutable_live_stream() {
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("Building REST APIs with Spring Boot");
        stream.setDescription("""
                Spring Boot is very conveient to use when building REST APIs;
                """);
        stream.setUrl("https://www.twitch.tv/danvega");
        stream.setStartDate(LocalDateTime.of(2022,2,16,11,0));
        stream.setStartDate(LocalDateTime.of(2022,2,16,12,0));

        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot", stream.getTitle());
    }

    @Test
    void create_new_imutable_live_stream() {
        ImmutableLiveStream stream = new ImmutableLiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                """
                Spring Boot is very conveient to use when building REST APIs;
                """,
                "https://www.twitch.tv/danvega",
                LocalDateTime.of(2022,2,16,11,0),
                LocalDateTime.of(2022,2,16,12,0)
        );
        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot", stream.getTitle());
    }

    @Test
    void create_new_record_live_stream() {
        LiveStream stream = new LiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                """
                Spring Boot is very conveient to use when building REST APIs;
                """,
                "https://www.twitch.tv/danvega",
                LocalDateTime.of(2022,2,16,11,0),
                LocalDateTime.of(2022,2,16,12,0)
        );
        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot", stream.title());
        assertTrue(stream.getClass().isRecord());
        assertEquals(6, stream.getClass().getRecordComponents().length);
    }

}