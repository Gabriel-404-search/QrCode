package codes.controller;

import codes.dto.QrCodeRequestDTO;
import codes.dto.QrCodeResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import codes.service.QrCodeService;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {
    private final QrCodeService qrCodeGeneratorService;

    public QrCodeController(QrCodeService qrCodeService) {
        this.qrCodeGeneratorService = qrCodeService;
    }

    @PostMapping
    public ResponseEntity<QrCodeResponseDTO> generate(@RequestBody QrCodeRequestDTO request) {
        try {
            QrCodeResponseDTO response = this.qrCodeGeneratorService.generateAndUploadQrCode(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
