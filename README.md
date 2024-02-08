### Algafood-API

### Empacotamento
```./mvnw package```

### Listar arquivos da pasta target
```ls target/```

### Executar aplicação
```java -jar target/algafood-api-0.0.1-SNAPSHOT.jar```

### Limpa os arquivos criados em builds anteriores
```./mvnw clean```

### Gerar arvore de dependências 
```./mvnw dependency:tree```

### Gerar arquivo pom
```./mvnw help:effective-pom```


### Spring IoC Container || Spring Context

<p>Quando rodamos uma aplicação o ioc container e inicializado
começa a instanciar os beans que ele deve gerenciar.<br>
Bean é o nome dado a objetos gerenciados pelo container do spring.</p>

A anotação ```@Configuration```  e baseada em ```@Component``` . Com objetivo principal a definição de beans.
<br><br>A anotação ```@Bean``` indica que o método ele instancia, configura um objeto gerenciado pelo container Spring.

### Pontos de injeção de dependência
- Construtor
- Construtor com @Autowired
- @Autowired
- Método Setter com @Autowired

Observação.: Em caso de mais de um construtor o Spring não consegue distinguir, qual contrutor utilizar por isso deve se utiliar ```@Autowired``` para indicar.

### 🐛 Erro de ambiguidade de beans.:

```
Description:

Field notificador in com.algaworks.algafood.service.AtivacaoClienteService required a single bean, but 2 were found:
- notificadorEmail: defined in file [C:\Users\luiz9\Documents\workspace-spring-tool-suite-4-4.20.1.RELEASE\algafood-api\target\classes\com\algaworks\algafood\notificacao\NotificadorEmail.class]
- notificadorSMS: defined in file [C:\Users\luiz9\Documents\workspace-spring-tool-suite-4-4.20.1.RELEASE\algafood-api\target\classes\com\algaworks\algafood\notificacao\NotificadorSMS.class]
```

### 💡 Soluções.:

1º Adicionando anotação ```@Primary``` em uma das classes que estejam vinculadas para definir a prioridade. <br>
2º Adicionando anotação ```@Qualifier``` ela serve para qualificar adicionando um identificador na classe que será injetada e referenciando na classe que receberá injeção de dependência. <br>
3º Criando anotação customizada;

<br>
Todos beans no eclipse tem um ciclo de vida.:

- Inicialização
- Utilização
- Destruição

Métodos de callback para capturar fases de um Bean no Spring.:
- ```@PostConstruct``` inicialização e ```@PreDestroy``` destruição. 
- ```@Bean(initMethod = "init", destroyMethod = "destroy")``` 
- Utilizando ```implements InitializingBean, DisposableBean```
