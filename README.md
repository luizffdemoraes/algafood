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