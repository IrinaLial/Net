package start;

import beans.HelperBean;
import model.*;
import model.monitoring.SiteMonitoring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.io.IOException;
import java.util.List;

public class MainSpring {
    public static void main(String[] args) throws IOException {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"config.xml"});


       final  Monitoring monitoring = (Monitoring) context.getBean("monitoring");
//       monitoring.getSites().forEach(System.out::println);


      final SiteMonitoring siteMonitoring = (SiteMonitoring) context.getBean("siteMonitoring");

      final List<String> sites = monitoring.getSites();
      for(String site: sites){
          siteMonitoring.monitoring(site);
      }
//        final UserService userService = (UserService) context.getBean("userService");
//        userService.print();


//        final Helper helper = (Helper) context.getBean("Helper");
//        System.out.println(helper.getName());
//        System.out.println(helper.getRole().getName());

//        final Data data = (Data) context.getBean("data");
//        System.out.println(data.getUrl());
//        System.out.println(data.getUserName());
//        System.out.println(data.getPassword());
//
//
//        final File file = (File) context.getBean("file");
//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//
//        final User user = (User) context.getBean("user");
//        System.out.println(user.getName());
//        System.out.println(user.getTodo().getName());
//        System.out.println(user.getOrganization().getName());
//        System.out.println(user.getOrganization().getCity());

//        final AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(HelperBean.class);
//        final Helper helper = annotationContext.getBean(Helper.class);
//        System.out.println(helper.getName());
//        System.out.println(helper.getRole().getName());




//        final One one = (One) context.getBean("one");
//        System.out.println(one.getName());
//
//        final Two two = (Two) context.getBean("two");
//        System.out.println(two.getName());
//
//        //context.destroy();
//
//        final Three three = (Three)context.getBean("three");
//        System.out.println(three.getName());

    }
}
