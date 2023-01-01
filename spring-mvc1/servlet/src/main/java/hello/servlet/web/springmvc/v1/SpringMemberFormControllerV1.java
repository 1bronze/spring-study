package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 스프링빈으로 등록, MVC에서 애노테이션 기반 컨트롤러로 인식
@Controller
public class SpringMemberFormControllerV1 {

    // 요청 정보 매핑
    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
