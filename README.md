# ⚔️ Rinha de Backend 2025 – Kotlin + Ktor

Este projeto é a minha participação na **Rinha de Backend 2025**, utilizando **Kotlin** com o framework **Ktor**. O objetivo é construir um backend leve, rápido e resiliente, capaz de intermediar pagamentos entre dois processadores com lógica de fallback inteligente.

---

## 🚀 Tecnologias Utilizadas

- **Kotlin 1.9**
- **Ktor 3.2 (Netty Engine)**
- Serialização com `kotlinx.serialization`
- HTTP Client nativo do Ktor
- Coroutines para concorrência leve
- Testes com `ktor-server-tests`
- Docker

---

## 🛠️ Como rodar localmente

### 1. Clonar o projeto

```bash
git clone https://github.com/seu-usuario/rinha-de-backend-2025-kotlin.git
cd rinha-de-backend-2025-kotlin
```

### 2. Rodar com Gradle
```bash
./gradlew run
```

O servidor iniciará em http://localhost:8080.
