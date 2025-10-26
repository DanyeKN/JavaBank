// Este é o cabeçalho moderno e recomendado para plugins
plugins {
    id("java")
}

// Configurações básicas
group = "br.com.dio"
version = "1.0-SNAPSHOT"

// Repositórios
repositories {
    mavenCentral()
}

// Definição de configurações e dependências
dependencies {
    // Dependências do Lombok (Annotation Processing Tool)
    compileOnly("org.projectlombok:lombok:1.18.30") // Usando uma versão recente
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    // JUnit BOM (para gerenciar versões de teste)
    testImplementation(platform("org.junit:junit-bom:5.10.0"))

    // Dependências de teste
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Bloco de configurações adicionais (necessário para o Lombok funcionar corretamente no IntelliJ)
configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}