package com.matheus.samplerestapi.repositories;

import com.matheus.samplerestapi.models.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}