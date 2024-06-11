package br.com.crislei.literAlura.model;

import br.com.crislei.literAlura.repository.AutorRepository;
import br.com.crislei.literAlura.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;

    public LivroService(LivroRepository livroRepository, AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    public List<Object[]> obterDadosAutor(Long autorId) {
        return autorRepository.obterDadosAutor(autorId);
    }
}