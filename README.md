# Projeto: Web Services com MongoDB e Spring Boot
### Objetivo geral:
 - Compreender as principais diferenças entre paradigma orientado a documentos e relacional
 - Implementar operações de CRUD
 - Refletir sobre decisões de design para um banco de dados orientado a documentos
 - Implementar associações entre objetos
 - Objetos aninhados
 - Referências
 - Realizar consultas com Spring Data e MongoRepository
### ENDPOINT:
`http://localhost:8080/posts/fullsearch?text=aproveite&minDate=2022-03-21&maxDate=2022-03-30`
### RESULTADO:
``[
    {
        "id": "6256ee5f099c5216a0d9ade0",
        "date": "2022-03-21T00:00:00.000+00:00",
        "title": "Partiu viagem",
        "body": "Vou viajar para São Paulo. Abraços!",
        "author": {
            "id": "6256ee5f099c5216a0d9addd",
            "name": "Maria Brown"
        },
        "comments": [
            {
                "text": "Boa viagem mano!",
                "date": "2022-03-21T00:00:00.000+00:00",
                "author": {
                    "id": "6256ee5f099c5216a0d9adde",
                    "name": "Alex Green"
                }
            },
            {
                "text": "Aproveite!",
                "date": "2022-03-22T00:00:00.000+00:00",
                "author": {
                    "id": "6256ee5f099c5216a0d9addf",
                    "name": "Bob Grey"
                }
            }
        ]
    }
]``
