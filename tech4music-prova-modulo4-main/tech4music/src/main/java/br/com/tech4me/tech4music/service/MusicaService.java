package br.com.tech4me.tech4music.service;

import java.util.List;

import br.com.tech4me.tech4music.shared.MusicaDto;

public interface MusicaService {
    
    List<MusicaDto> obterTodasAsMusicas();
    MusicaDto obterMusicaPorId(String id);
    MusicaDto obterPorNome(String nome);
    MusicaDto cadastrarMusica(MusicaDto musica);
    MusicaDto alterarMusica(String id, MusicaDto musicaAlterar);
    void deletarMusica(String id);

}
