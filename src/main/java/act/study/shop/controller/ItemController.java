package act.study.shop.controller;

import act.study.shop.domain.ItemVO;
import act.study.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RequestMapping("/item")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ItemVO>> getItemAll() {
        List<ItemVO> item = itemService.getItemAll();
        return new ResponseEntity<List<ItemVO>>(item, HttpStatus.OK);
    }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemVO> addItem(@RequestBody ItemVO itemVO){
        return new ResponseEntity<ItemVO>(itemService.addItem(itemVO),HttpStatus.OK);
    }
}
