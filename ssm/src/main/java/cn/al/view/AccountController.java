package cn.al.view;

import cn.al.domain.Account;
import cn.al.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * 控制器
 */
@Controller("accountController")
@RequestMapping("account")
public class AccountController {

    /**
     * accountService
     */
    @Autowired
    private IAccountService accountService;

    /**
     * 获取所有客户
     */
    @RequestMapping("findAllAccount")
    public ModelAndView findALLAccount(){
        List<Account> accounts = accountService.findAllAccount();
        ModelAndView mv = new ModelAndView();
        mv.addObject("accounts", accounts);
        mv.setViewName("account");
        return mv;
    }
}
