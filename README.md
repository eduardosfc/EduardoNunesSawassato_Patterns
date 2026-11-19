# Patterns

Trabalho de Design Patterns. Escolhi um pattern de cada categoria:

| Categoria | Pattern | Pasta |
|---|---|---|
| Criacional | Abstract Factory | `abstract-factory/` |
| Estrutural | Adapter | `adapter/` |
| Comportamental | Strategy | `strategy/` |

## Como rodar

Precisa do JDK instalado. Dentro de cada pasta:

```
javac -d out *.java
java -cp out Main
```

## O que cada um faz

**Abstract Factory:** uma aplicação de UI com tema claro e escuro. A `Application` recebe uma `UIComponentFactory` e cria botão, caixa de texto e checkbox sem saber qual tema é. Pra criar um tema novo é só fazer uma factory nova e os componentes dele, sem mexer no que já existe.

**Adapter:** o sistema novo usa a interface `Logger`, mas a biblioteca antiga é a `LegacyLogger`. O `LegacyLoggerAdapter` implementa `Logger` e por dentro chama `legacy.log(...)`. A `Application` só conhece o `Logger`.

**Strategy:** o `Cart` calcula o total usando uma `DiscountStrategy` (sem desconto, percentual ou valor fixo). Dá pra trocar a estratégia em tempo de execução com `setDiscountStrategy`, e o desconto fixo nunca deixa o total negativo.
