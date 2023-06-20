package listservice.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeaderRepositoryTest {

    HeaderRepository headerRepository = new HeaderRepository();
    @Test
    void save() {

        //given
        Item item = new Item("아자아잣 홧팅이다!", 1L);

        //when
        Item saveItem = headerRepository.saveHeader(item);

        //then
        Item findItem = headerRepository.findByHeader(saveItem.getHeaderId());
        Assertions.assertThat(findItem).isEqualTo(findItem);

    }

    @Test
    void delete() {
        //given
        Item item = new Item("아자아잣 홧팅이다!", 1L);

        //when
        headerRepository.delete(item);

        //then
        Item findItem = headerRepository.findByHeader(item.getHeaderId());
        Assertions.assertThat(findItem).isNull();

    }

    @Test
    void updateHeader() {
        //given
        Item item1 = new Item("아자아잣 팟탱이다~!", 1L);
        headerRepository.saveHeader(item1);
        Long itemId1 = item1.getHeaderId();

        //when
        Item item2 = new Item("개인 프로젝트 완성하기", 1L);
        headerRepository.headerUpdate(itemId1, item2);

        //then
        Item findItem = headerRepository.findByHeader(itemId1);

        System.out.println(findItem.getHeader());
        System.out.println(item2.getHeader());

        Assertions.assertThat(findItem.getHeaderId()).isEqualTo(item2.getHeaderId());
        Assertions.assertThat(findItem.getHeader()).isEqualTo(item2.getHeader());

    }
}