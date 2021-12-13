package me.whiteship.restapiwithspring.events;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ha
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class EventControllerTest {

    /*
    요청을 만들고 응답을 확인 할 수 있는 객체
    조금 더 빠른 테스트 가능(단위 테스트보다는 아님)
     */
    @Autowired
    MockMvc mockMvc;

    @Test
    public void createEvent() throws Exception{
        mockMvc.perform(post("/api/events/")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaTypes.HAL_JSON)
            )
            .andExpect(status().isCreated());
    }
}
