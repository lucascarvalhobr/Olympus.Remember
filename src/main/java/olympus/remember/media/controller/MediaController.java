package olympus.remember.media.controller;

import olympus.remember.media.models.MediaRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medias")
public class MediaController {

    @PostMapping
    public void add(@RequestBody MediaRequest request){
    }
}
