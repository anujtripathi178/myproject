package com.beta.replyservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ReplyController {

	@GetMapping("/reply")
	public ReplyMessage replying() {
		return new ReplyMessage("Message is empty");
	}

	@GetMapping("/reply/{message}")
	public ReplyMessage replying(@PathVariable String message) {
		String revStr = AppUtility.reverseString(message);
		byte[] md5InBytes = AppUtility.digest(revStr.getBytes(AppUtility.UTF_8));
		return new ReplyMessage(AppUtility.reverbytesToHex(md5InBytes);
	}
}