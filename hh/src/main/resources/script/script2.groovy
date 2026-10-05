import com.sap.gateway.ip.core.customdev.util.Message

  def Message processData(Message message) {
      message.setBody("Hello from Exception Subprocess")
      return message
  }