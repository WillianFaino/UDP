# README

Este documento apresenta uma descrição do código Java que implementa um servidor UDP simples. O servidor escuta em uma porta específica e exibe os pacotes recebidos junto com informações sobre a origem dos pacotes. Abaixo, são fornecidos detalhes sobre a estrutura do código e suas funcionalidades.

## Descrição do Código

### Dependências
O código utiliza as bibliotecas padrão do Java para operações de entrada/saída (`java.io.IOException`), manipulação de sockets (`java.net.DatagramPacket` e `java.net.DatagramSocket`), e tratamento de exceções (`java.net.SocketException`).

### Estrutura do Código

#### Classe `ServerUDP`
A classe `ServerUDP` contém a lógica principal do servidor UDP. Os principais componentes da classe são:

- **Variável `PORTA`**: Define a porta em que o servidor escutará por pacotes. Neste caso, a porta padrão é 8080.

- **Método `main(String[] args)`**: Este é o ponto de entrada do programa. Dentro desse método, o servidor realiza as seguintes operações:
  - Cria um objeto `DatagramSocket` para escutar na porta definida.
  - Cria um objeto `DatagramPacket` para armazenar os dados recebidos. O tamanho do buffer é configurado para 1024 bytes.
  - Entra em um loop infinito onde o servidor aguarda pacotes de dados. Quando um pacote é recebido:
    - O endereço do remetente e a porta são extraídos e exibidos.
    - O conteúdo do pacote é convertido de bytes para uma string e impresso.

### Tratamento de Exceções
O código inclui tratamento básico de exceções:
- `SocketException`: Trata erros relacionados à criação do socket.
- `IOException`: Trata erros relacionados à entrada e saída de dados.

Ambas as exceções imprimem a stack trace no console para facilitar a depuração.

## Compilação e Execução
Para compilar e executar o código, utilize os seguintes comandos no terminal:

```bash
javac ServerUDP.java
java ServerUDP
```

Certifique-se de que o Java esteja instalado e configurado corretamente em seu ambiente.

## Observações
- O servidor escuta indefinidamente por pacotes. Para interromper a execução, você pode usar `Ctrl+C` no terminal.
- O código é simples e pode ser expandido para incluir funcionalidades adicionais, como processamento de dados recebidos ou resposta a clientes.
- Para testar o servidor, você pode usar um cliente UDP que envie pacotes para a porta 8080. 

Este código fornece uma base para entender a comunicação via UDP em Java e pode ser um ponto de partida para o desenvolvimento de aplicações de rede mais complexas.
