package cl.bytebandits.venta_autos_web.lwt;

import org.springframework.web.filter.OncePerRequestFilter;

import io.basc.framework.http.HttpHeaders;
import io.basc.framework.util.StringUtils;

import java.io.IOException;
import org.springframework.stereotype.Component;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter{

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        final String token = getTikenFromRequest(request);

        if(token == null)
        {
            filterChain.doFilter(request, response);
            return;
        }
        filterChain.doFilter(request, response);
    }

    private String getTikenFromRequest(HttpServletRequest request) {
        final String AuthHeader = request.getHeader(HttpHeaders.AUTHORIZATION);

        if (StringUtils.hasText(AuthHeader) && AuthHeader.startsWith("Bearer ")){
            return AuthHeader.substring(7);
        }
        return null;
    }

}
