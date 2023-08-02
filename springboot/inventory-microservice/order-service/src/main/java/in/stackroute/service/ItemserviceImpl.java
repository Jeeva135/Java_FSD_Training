package in.stackroute.service;

import in.stackroute.domain.Order;
import in.stackroute.dto.Item;
import in.stackroute.dto.ItemCodeSearchDto;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemserviceImpl implements ItemService {

    private RestTemplate restTemplate;

    private final String itemServiceUrl = "http://ITEM-SERVICE/api/v1/items/search-codes";

    public ItemserviceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public List<Item> getItemsByIds(List<String> codes) {
        final var dto=new ItemCodeSearchDto(codes);
        HttpEntity<ItemCodeSearchDto> request=new HttpEntity<>(dto);
        final var result=restTemplate.postForEntity(itemServiceUrl,request,Item[].class);
        return Arrays.asList(result.getBody());
    }
}
