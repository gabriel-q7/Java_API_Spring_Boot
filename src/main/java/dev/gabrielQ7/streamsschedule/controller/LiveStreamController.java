package dev.gabrielQ7.streamsschedule.controller;

import dev.gabrielQ7.streamsschedule.model.LiveStream;
import dev.gabrielQ7.streamsschedule.repository.LiveStreamRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    // GET http://localhost:8081/streams
    @GetMapping
    public List<LiveStream> findAll() {
        return repository.findAll();
    }

    // GET http://localhost:8081/streams/{id}
    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id) {
        return repository.findById(id);
    }

    // POST http://localhost:8081/streams
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream create(@RequestBody LiveStream stream) {
        return repository.create(stream);
    }

    // PUT http://localhost:8081/streams/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody LiveStream stream, @PathVariable String id) {
        repository.update(stream,id);
    }

    //  DELETE http://localhost:8081/streams/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        repository.delete(id);
    }

    // ResponseEntity<LiveStream>: allow adding headers
    // @Valid : validates the constraints
}
