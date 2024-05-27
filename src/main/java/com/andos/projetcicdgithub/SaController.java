package com.andos.projetcicdgithub;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author Anderson Ouattara 2024-05-27
 */
@RestController
@RequestMapping("sa")
public class SaController {

  @GetMapping
  public List<Object> search() {
    return List.of(new Sa(1, "Belle formation", 1));
  }
}
