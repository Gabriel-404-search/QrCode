QrCode Generator com AWS ☁️📱

Projeto desenvolvido para geração e upload de QrCodes utilizando bibliotecas do Google e armazenamento em bucket S3 da AWS. O objetivo foi experimentar o uso de serviços em nuvem e integração com APIs externas.

🔧 Tecnologias utilizadas

Java 17

Spring Boot

Biblioteca do Google para geração de QR Codes

AWS SDK (S3)

Docker

Maven

✅ Funcionalidades

Geração de QR Code a partir de texto

Upload automático do QR Code para bucket S3

Organização por pastas dentro do bucket

Endpoint REST para gerar e armazenar QR Code

📁 AWS

Uso do bucket: qrcode-testgab

Região configurada: us-east-2

Permissões básicas de leitura e escrita

📆 Como executar

# Build do projeto
mvn clean install

# Executar o JAR
target/qrcode-generator.jar

📂 Estrutura de pacotes

src/
├── controller
├── service
├── config
├── util
└── model

📝 Observações

Projeto ideal para treinar conceitos básicos de cloud e integração com serviços externos.

👨‍💻 Autor

Gabriel Marques da Silva

