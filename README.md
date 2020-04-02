# springcould-

1.使用微服务调用必须保证调用提供方时提供方要在eureka注册中心注册开启。
2.还需注意FeignClient注解的name不能重复。
3.对于get请求尽量不要使用  @GetMapping注解可能又是出现bug。
4.传递参数是注意在@RequestParam加上与提供方协商好的参数名称，防止有些机器找不到具体参数，
