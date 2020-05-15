一.入门spring
	1.建立项目，导包，书写配置文件(applicationContext.xml)
	2.入门demo(HelloSpring)
		1)书写HelloSpring
		2)配置文件中配置相应的bean
		3)进行测试Test1
二.spring第一大特性(IOC:依赖注入)
	非注解方式依赖注入:
		1.书写UserAction类，UserDao类，配置文件中进行依赖注入配置
			1)setter方式注入
			2)构造函数方式注入(construct-arg)
			3)进行测试Test2
		2.bean有scope属性(取值分别是singleton,prototype,request,session)
		3.可进行bean自动装配(声明部分书写:default-autowire="byName")
	工厂模式:
		1.简单工厂(静态工厂)
			1)工厂方法必须为静态
			2)配置工厂bean
			3)进行测试Test3
		2.抽象工厂(动态工厂)
			1)建立抽象工厂
			2)通过继承实现具体工厂
			3)配置工厂bean
			4)Test4
	注解方式依赖注入:
		1.语义注解:@Controller，@Service，@Repository,本质都是@Component。
		     bean声明周期注解@Scope("prototype"):singleton,prototype ,request,session,globalSession
		2.自动装配Bean 
			1)@Autowired : 采用类型的方式完成自动装配 ： byType
			2)@Resource : 采用名称+类型的方式完成自动装配 : byName +byType，此种方法推荐使用。
		3.配置文件中配置包扫描
			<context:component-scan base-package="spring.ioc">
			1)exclude
			2)include
		4.书写UserAction类，UserDao类，配置文件中配置扫描包
			1)各类上打注解,setter方式注入
			2)进行测试Test5
三.aop(通过代理模式实现)
	代理模式
		1.静态代理
			1)代理类与被代理类实现共同的接口
			2)代理类为被代理类做事
			2)进行测试Test6
		2.动态代理(java反射机制)
			1)Proxy.newProxyInstance
			2)进行测试Test7
	aop
		1.切入点
		2.通知
		3.进行你测试Test8
	
	
	
	
	
	
	
	
	
	
	