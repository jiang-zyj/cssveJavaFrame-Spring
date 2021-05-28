Spring中注解【原生】

@Component
    分层：
        1. @Controller  【web层】
        2. @Service     【业务层】
        3. @Repository  【持久层】

    属性注入：
        @Autowired  @Qualifier 组合使用
        @Autowired 是通过 byType 的形式从容器中找，如果找不到，则先不会报错，会以 byName 的形式再去找，如果 byName 也找不到
                    则就会报错，被 @Autowired 标注的属性必须被装配，如果装配不了，则会报错
                    也可以通过 required = false 来设置该属性不是必须被装配的。
        @Qualifier 如果匹配到多个兼容类型的 bean，可以通过 @Qualifier 来进行装配，@Qualifier 是通过 byName (指定 bean 的 id)来从 IOC 容器中找。找不到则报错。

        这两个注解可以标注在属性上，也可以标注在对应的 set 方法上。

        @Resource   按照 bean 的 id 进行注入，需要指定 id，所以较为@Autowired


@Scope(value = "xxx")
    指定对象的范围，默认是 singleton(单例)，也可以指定为 protoType(原型)

@Value()
    可以使用字面量、SpEL语法(Spring的EL表达式)，不能用于操作复杂数据类型(List、Map、JavaBean)

@PostConstruct
    放在方法头部，用于创建 bean 时做操作
@PreDestroy
    放在方法头部，用于销毁 bean 时做操作

@RunWith(SpringJunit4ClassRunner.class)
    让一个类变为一个做单元测试的类,通常用于测试类

@ContextConfiguration()
    读取配置文件/加载配置类


