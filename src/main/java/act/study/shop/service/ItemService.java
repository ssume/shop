package act.study.shop.service;

import act.study.shop.domain.ItemVO;
import act.study.shop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemVO> getItemAll(){
        List<ItemVO> item = new ArrayList<>();
        itemRepository.findAll().forEach(e -> item.add(e));
        return item;
    }

    public ItemVO addItem(ItemVO itemVO){
        itemRepository.save(itemVO);
        return itemVO;
    }
}
