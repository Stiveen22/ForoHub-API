package com.BackEnd.BackEnd;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {
    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private String expiration;

    public String generarToken(Authentication authentication) {
        Date ahora = new Date();
        Date fechaExpiracion = new Date(ahora.getTime() + Long.parseLong(expiration));

        return Jwts.builder()
                .setIssuer("API BackEnd")
                .setSubject(authentication.getName())
                .setIssuedAt(ahora)
                .setExpiration(fechaExpiracion)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    public boolean esTokenValido(String token) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String obtenerUsuario(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }
}
