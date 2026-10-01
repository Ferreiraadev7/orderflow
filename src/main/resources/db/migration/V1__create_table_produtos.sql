CREATE TABLE produtos (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    preco NUMERIC(10,2) NOT NULL CHECK ( preco >=0 ),
    estoque INTEGER NOT NULL CHECK ( estoque >=0 ),
    ativo BOOLEAN NOT NULL DEFAULT TRUE

);
