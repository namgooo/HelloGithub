package green.spring.HelloGit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("hellogit")
	@ResponseBody
	public String hellogit(Model model) {
		
		List<String> menu = new ArrayList<>();
		
		menu.add("돈까스");
		menu.add("초밥");
		menu.add("라면");
		
		model.addAttribute("menu", menu);
		
		return "hellogit";
	}
	
}





