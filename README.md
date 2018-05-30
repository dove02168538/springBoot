Springboot整合Mybatis简约版

备注：@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
是无法跳转页面的   页面中会显示json

@Controller  不加@ResponseBody 才可以跳转页面
跳转页面的前缀和后缀在application.yml配置