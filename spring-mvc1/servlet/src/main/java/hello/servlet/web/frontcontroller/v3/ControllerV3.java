package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    // v2는 프론트 컨트롤러 -> 컨트롤러로 requset, response 를 직접 전달.
    // 그러나 실제 필요한 것은
    // 1. Form 컨트롤러: viewPath(컨트롤러에 대응되는 Jsp를 프론트 컨트롤러에서 실행하기 위함.)
    // 2. Save 컨트롤러: viewPath(컨트롤러에 대응되는 Jsp를 프론트 컨트롤러에서 실행하기 위함.)와 username, age(Member 객체를 만들어 저장하기 위함.)
    // 3. List 컨트롤러: viewPath(컨트롤러에 대응되는 Jsp를 프론트 컨트롤러에서 실행하기 위함.)
    ModelView process(Map<String, String> paramMap);
}
