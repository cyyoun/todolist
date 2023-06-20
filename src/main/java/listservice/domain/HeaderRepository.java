package listservice.domain;

import java.util.HashMap;
import java.util.Map;

public class HeaderRepository {
    private static Map<Long, Item> headerMap = new HashMap<>();
//    private static Map<Long, Item> listMap = new HashMap<>();
    private static Long headerSequence = 0L;
//    private static Long listSequence = 0L;

    public Item saveHeader(Item item) {
        item.setHeaderId(++headerSequence);
        headerMap.put(item.getHeaderId(), item);
        return item;
    }

    public Item findByHeader(Long itemId) {
        Item item = headerMap.get(itemId);
        return item;
    }


//    public Item saveList(Item item) {
//        item.setList(String.valueOf(++listSequence));
//        listMap.put(item.getListId(), item);
//        return new Item();
//    }

    public void headerUpdate(Long itemId, Item updateParam) {
        Item findItem = headerMap.get(itemId);
        findItem.setHeader(updateParam.getHeader());
        findItem.setHeaderId(updateParam.getHeaderId());
    }


    public void delete(Item item) {
        Item getItem = headerMap.get(item.getHeaderId());
        headerMap.remove(getItem);
    }
}
