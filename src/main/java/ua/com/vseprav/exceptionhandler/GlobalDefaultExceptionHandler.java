package ua.com.vseprav.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@EnableWebMvc
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String  defaultErrorHandler(HttpServletRequest req, Exception e, Model model){
        model.addAttribute("stackTrace",e.getStackTrace());
        model.addAttribute("message",e.getMessage());
        model.addAttribute("url",req.getRequestURL());
        return "error";
    }

}
