package Web;


import org.P_Child_Java.App;
import org.P_Child_Java.Interface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello",produces="application/json")
public class Hi 
{
	Interface i=new App();
	@RequestMapping(value="/mapping",method=RequestMethod.GET)
	
      @ResponseBody
	public String display()
	{
	 i.setX("laxmi");
	
	return i.getX();
	
	}
}

