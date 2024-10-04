package com.jesusespinoza.jesustrabajofinal.exception;

import java.time.LocalDateTime;

public record CustomErrorResponse(
    LocalDateTime datetime,
    String messaje,
    String path
    ) {
}
