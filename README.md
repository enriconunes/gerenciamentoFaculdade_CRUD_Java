# gerenciamento-faculdade-JAVA-MELHORADO
Cadastro, exclusão e edição de entidades de uma universidade feito em Java.

Este projeto teve como objetivo gerenciar o cadastro de alunos, professores, disciplinas e cursos da Universidade da Beira Interior utilizando a linguagem Java. O gerenciamento consiste em cadastrar, excluir ou editar estes objetos por meio de um menu, onde há funções programadas para impossibilitar atividades inexequíveis como cadastrar objetos iguais e remover ou editar objetos inexistentes. Com esse projeto, pude exercitar os conhecimentos de programação orientada a objetos, hierarquia de classes com 'extends', arraylists, exceções com 'try' e 'catch', testes unitários com JUnit e documentação da aplicação com Javadoc.

Menu do programa:
    1. Cadastro
    1.1 Aluno 
    1.2 Professor
    1.3 Curso
    1.4 Disciplina

    2. Exibir
    2.1 Alunos 
    2.2 Professores
    2.3 Cursos
    2.4 Disciplinas

    3. Editar
    3.1 Alunos
        3.1.1 Editar nome
        3.1.2 Editar sexo
        3.1.3 Editar país de origem
        3.1.4 Editar universidade de origem
        3.1.5 Editar curso
        3.1.6 Adicionar disciplinas
        3.1.7 Remover disciplinas
    3.2 Professores
        3.2.1 Editar nome
        3.2.2 Editar sexo 
        3.2.3 Editar cargo
        3.2.4 Editar email
        3.2.5 Editar telefone
    3.3 Cursos
        3.3.1 Editar nome
        3.3.2 Adicionar disciplina
        3.3.3 Remover disciplina
    3.4 Disciplinas
        3.4.2 Editar nome
        3.4.2 Editar quantidade de ECTS 
        3.4.2 Editar idioma
        3.4.2 Adicionar professor
        3.4.2 Remover professor
    4. Ver manual do programa
    0. Sair
        Salvar alteracoes
        Nao salvar

Melhorias implementadas nesta versão:
Os dados são salvos em arquivos .txt que são lidos automaticamente logo ao inicializar o programa. Assim, os dados não são perdidos ao fechar o projeto.

Possíveis melhorias:
Implementar funções para realizar tarefas que são executadas diversas vezes, evitando a repetição de linhas de código que podem ser substituídas por uma única fução.
